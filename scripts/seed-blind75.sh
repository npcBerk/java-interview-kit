#!/usr/bin/env bash
# Generates a solution + test skeleton for every problem in scripts/blind75.tsv.
# Problems that already exist are skipped, so it is safe to re-run.
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
created=0
while IFS=$'\t' read -r num slug pattern title sig; do
  [[ -z "$num" || "$num" == \#* ]] && continue
  if find "$ROOT/leetcode/src/main/java" -name "P${num}_*.java" | grep -q .; then continue; fi
  LC_TITLE="$title" "$ROOT/lc" new "$num" "$slug" "$pattern" "$sig" >/dev/null
  created=$((created+1))
done < "$ROOT/scripts/blind75.tsv"
echo "Created $created problem(s)."
