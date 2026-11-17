#!/usr/bin/env bash
# Generates a solution + test skeleton for every problem in a problem list.
#   scripts/seed.sh                      # uses scripts/blind75.tsv
#   scripts/seed.sh scripts/my-list.tsv  # any TSV in the same format
# Format (tab-separated): number  slug  pattern  title  signature   (";;" separates methods)
# Problems that already exist are skipped, so it is safe to re-run.
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
LIST="${1:-$ROOT/scripts/blind75.tsv}"
[ -f "$LIST" ] || { echo "Error: list not found: $LIST" >&2; exit 1; }
created=0
while IFS=$'\t' read -r num slug pattern title sig || [ -n "$num" ]; do
  [[ -z "$num" || "$num" == \#* ]] && continue
  if find "$ROOT/leetcode/src/main/java" -name "P${num}_*.java" | grep -q .; then continue; fi
  LC_TITLE="$title" "$ROOT/lc" new "$num" "$slug" "$pattern" "$sig" >/dev/null
  created=$((created+1))
done < "$LIST"
echo "Created $created problem(s) from $(basename "$LIST")."
