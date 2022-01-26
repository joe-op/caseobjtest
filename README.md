# Case object test

Test repo for formatting of Scala case class and object definitions.

## Usage
Comparison between scalafmt and IntelliJ range formatting

**STEPS**

- Scalafmt with sbt task `scalafmtAll`
- In IntelliJ Idea, select the three case class/object definitions in Book.scala (lines 6-8) and select Code > Reformat Code

**RESULT**

Blank lines are not added between the definitions by scalafmt, but are added by the IntelliJ range formatter. 