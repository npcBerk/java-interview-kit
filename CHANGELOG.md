# Changelog

All notable changes to this project are listed here. The format follows
[Keep a Changelog](https://keepachangelog.com/en/1.1.0/) and the project uses [Semantic Versioning](https://semver.org/).

## [1.1.0] - 2026-11-17

### Removed
- Spring Boot playground and the `./lc spring` command.
- `notes/behavioral.md`. The kit now focuses on solving LeetCode-style problems locally.

## [1.0.0] - 2026-11-17

### Added
- Blind 75 stubs organized by pattern, with the real LeetCode method signatures.
- Tests where unsolved problems are reported as skipped instead of failing.
- `lc` CLI: `list`, `progress`, `random`, `open`, `test`, `new`, `fav`, `try`, `spring`, `update`.
- `scripts/seed.sh` to generate stubs from any problem list in TSV format.
- `ListNode`, `TreeNode` and `Node` with builders, plus `Grids` test helpers.
- Notes templates: mistake log, favorites, pattern cheat sheet, STAR stories.
- Scratch playground and a Spring Boot playground (web, JPA, H2, validation, actuator).
- Maven wrapper, so only a JDK is needed.

[1.1.0]: https://github.com/npcBerk/java-interview-kit/releases/tag/v1.1.0
[1.0.0]: https://github.com/npcBerk/java-interview-kit/releases/tag/v1.0.0
