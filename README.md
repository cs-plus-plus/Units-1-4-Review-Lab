# CS++ Units 1–4 Review Lab

**Replaces:** College Board's retired *Consumer Review Lab*
**Curriculum days:** 19–20 (AP CSA — CS++ 90-day plan)
**CED topics:** 1.1, 1.8, 1.9, 2.3, 2.4, 2.6, 2.7, 2.8, 2.12

A 2-day applied review covering everything from Unit 1 (primitives) through Unit 4 (iteration). You implement a small set of static utility methods on customer-review data, then get your grade from the Maven/JUnit test suite.

---

## Day 1 — Build

**Objectives**
- Integrate primitives, `String`/`Math`, selection, and iteration in one mini-project.
- Debug by reading compiler/test error messages and adding targeted print statements.
- Use the Maven test suite to verify behavior incrementally.

**Procedure (90 min)**
1. Lab overview & pair assignment (10 min)
2. Requirements walkthrough (10 min)
3. Build — core methods (40 min)
4. Run `mvn test` and iterate (20 min)
5. Daily checkpoint commit (10 min)

**Success criteria**
- At least **half of Maven tests passing** by end of class
- You can explain each method signature to your partner

**Exit ticket:** Which method is still red, and what's blocking you?

---

## Day 2 — Finish & Reflect

**Objectives**
- Complete all deliverables.
- Add at least one new unit test of your own.
- Present your solution to a peer group.

**Procedure (90 min)**
1. Stand-up: yesterday's blockers (10 min)
2. Focused build & test (45 min)
3. Add one new test case to `ReviewStatsTest` (10 min)
4. Peer-group demo (15 min)
5. Reflection writeup in `REFLECTION.md` (10 min)

**Success criteria**
- All required Maven tests green
- Short written reflection committed to the repo

**Exit ticket:** What habit from this lab will carry into Unit 5?

---

## What to implement

Open `src/main/java/csplusplus/review/ReviewStats.java` and replace each `UnsupportedOperationException` with a working solution:

| Method | Returns | CED |
|---|---|---|
| `averageRating(int[] ratings)` | `double` mean | 1.1, 2.6 |
| `countFiveStar(int[] ratings)` | `int` count of 5s | 2.7 |
| `topRating(int[] ratings)` | `int` highest, `-1` if empty | 2.7 |
| `describeRating(int rating)` | `String` label | 2.3, 2.4 |
| `containsWord(String review, String word)` | `boolean`, case-insensitive | 1.8, 1.9 |
| `totalLength(String[] reviews)` | `int` sum of lengths | 2.7, 1.9 |
| `reverseReviewOrder(String[] reviews)` | new `String[]` reversed | 2.7, 2.8 |

## Workflow

```bash
# From the repo root
mvn test          # run all tests
mvn -q test       # quieter output
mvn -Dtest=ReviewStatsTest#averageRating_basic test   # one test
```

Commit and push to GitHub — the autograder will run `mvn -B -q test` and grade your score.

## Requirements

- Java 17+
- Maven 3.8+
