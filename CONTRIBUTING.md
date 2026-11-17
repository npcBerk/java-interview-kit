# Contributing

Thanks for helping out! Bug reports, new problem lists, CLI improvements and doc fixes are all welcome.

## Ground rules

- **Don't copy problem statements or examples** from LeetCode into the repo. Use the number, title, link and Java signature only.
- Keep the template **solution-free**. Stubs must throw `UnsupportedOperationException("TODO")`.
- `./lc test` must stay green: every stub compiles and every test is reported as skipped.

## Adding problems or a new list

1. Add rows to `scripts/blind75.tsv`, or to a new TSV in the same format. The columns are tab-separated:
   `number  slug  pattern  title  signature`. Separate multiple methods with `;;`.
2. The pattern must be one of the `PATTERNS` in `lc`. If you need a new one, add it there and in `notes/patterns.md`.
3. Run `scripts/seed-blind75.sh`, then `./lc test`, and commit the generated files.

## Changing the CLI

`lc` is plain Bash and must work with macOS's Bash 3.2 and BSD tools as well as on Linux. CI runs `shellcheck`.

## Pull requests

Keep them small and focused, and say in the description what you changed and how you tested it.
