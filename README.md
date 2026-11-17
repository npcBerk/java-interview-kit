# Java Interview Kit

[![CI](https://github.com/npcBerk/java-interview-kit/actions/workflows/ci.yml/badge.svg)](https://github.com/npcBerk/java-interview-kit/actions/workflows/ci.yml)
![Java 21](https://img.shields.io/badge/Java-21-orange)
![License: MIT](https://img.shields.io/badge/license-MIT-blue)

A ready-to-use **GitHub template** for coding-interview prep in Java. It's offline and works pattern by pattern.

Java 21 · Maven · JUnit 5 + AssertJ · Spring Boot 4 · one small CLI (`./lc`)

<p align="center"><img src="docs/demo.svg" alt="lc CLI: progress per pattern, problem list with solved and favorite marks, a random pick and the test summary" width="520"></p>

## Why

- **Organized by pattern, not by number.** The Blind 75 ships pre-sorted into `slidingwindow/`, `heap/`, `graph/`, `dp/`… so you practice the way interviews test you.
- **Unsolved = skipped, never red.** Each stub throws `UnsupportedOperationException("TODO")`. While that line is there, its tests are reported as *skipped*. Delete it, write your solution and the tests run. `./lc test` stays green, and the skipped count is your to-do list.
- **No LeetCode login, no scraping.** Everything runs locally with `mvn test`. To submit, paste the method body into LeetCode.
- **More than algorithms.** It also includes a mistake log, favorites, a pattern cheat sheet, a STAR template for behavioral questions, a Java scratchpad and a Spring Boot playground for backend questions.

## Quick start

1. Click **Use this template → Create a new repository**. Making it **private** is a good idea once your notes get personal.
2. Clone it and check the setup (you need JDK 21+ and Maven):

```bash
./lc list
```

```bash
./lc test
```

3. Pick a problem and solve it:

```bash
./lc random slidingwindow
```

```bash
./lc open 3
```

In the solution file, delete the `throw new UnsupportedOperationException("TODO")` line and write your code. In the test file, replace `addExamples()` with the LeetCode examples and your own edge cases. Then run:

```bash
./lc test 3
```

## Commands

| Command | What it does |
| --- | --- |
| `./lc list [pattern]` | All problems: `✓` solved, `·` todo, `★` favorite |
| `./lc progress` | Solved / total per pattern |
| `./lc random [pattern]` | A random unsolved problem |
| `./lc open <no>` | Open the solution and its test (Cursor, VS Code or IntelliJ) |
| `./lc test [no]` | Run one problem's tests, or all of them |
| `./lc new <no> <slug> <pattern> [signature]` | Add any problem, e.g. `./lc new 1 two-sum hashing "int[] twoSum(int[] nums, int target)"` |
| `./lc fav <no> [note]` | Add the problem to `notes/favorites.md` |
| `./lc try [file]` | Run `playground/Scratch.java` (or the given file) |
| `./lc spring` | Start the Spring Boot playground on http://localhost:8080 |

## Layout

```
├── lc                              ← the CLI (./lc help)
├── leetcode/                       ← Maven project
│   ├── src/main/java/interviewkit/
│   │   ├── common/                 ← ListNode, TreeNode, Node (+ builders: TreeNode.of(3, 9, 20, null, null, 15, 7))
│   │   └── problems/<pattern>/P<no>_<Name>.java
│   ├── src/test/java/interviewkit/
│   │   ├── support/                ← ProblemTest (TODO → skipped), Grids helpers
│   │   └── problems/<pattern>/P<no>_<Name>Test.java
│   └── templates/                  ← used by ./lc new
├── scripts/
│   ├── blind75.tsv                 ← problem list (number, slug, pattern, title, signature)
│   └── seed-blind75.sh             ← regenerates missing stubs from the list
├── notes/                          ← mistakes, favorites, patterns, behavioral (STAR)
├── playground/Scratch.java         ← free experiments
└── spring/spring-playground/       ← Spring Boot: web, JPA, H2, validation, actuator
```

## Tips

- Problems marked **(Premium)** need LeetCode Premium. Most of them have free equivalents on LintCode or NeetCode.
- Design problems (Trie, Codec…) use the `P<no>_<Name>` class name. Rename the class to LeetCode's name when you submit.
- Want a different list (NeetCode 150, Grind 75, your company's tagged list)? Add rows to a TSV in the same format and point `seed-blind75.sh` at it, or use `./lc new`.

### Getting template updates into your copy

```bash
git remote add template https://github.com/npcBerk/java-interview-kit.git
```

```bash
git fetch template && git merge template/main --allow-unrelated-histories
```

## Contributing

Issues and PRs are welcome. See [CONTRIBUTING.md](CONTRIBUTING.md).

## License

[MIT](LICENSE). Problem statements belong to LeetCode. This repo only links to them and does not copy them.
