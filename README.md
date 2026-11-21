# Workout Calculator

A terminal-based command-line mini app for logging and reviewing "run" or "walking" workouts.
This is my first serious project, and I wrote it heavily with the help of AI for explanations and debugging since I'm still in the beginner phase.

## Features

- Add a workout (duration, distance, date)
- List saved workouts and view a summary of any of them
- Input validation for bad numbers and invalid dates

## How to run

Requires Java 14 or newer (the code uses the `->` switch syntax).

Compile first, then run, from the project folder:

```
javac *.java
java Main
```

## Commands

- `add`: prompts for duration (minutes), distance (meters), and date (YYYY-MM-DD)
- `list`: shows all saved workouts, then lets you pick one for its summary
- `quit`: exits the program

## Notes

Workouts are kept in memory only, so they are lost when the program closes.

## Future improvements

- Save workouts to a file so they aren't lost when the program stops
- Delete or edit workouts
- Weekly totals and personal bests
- (Maybe) Calisthenics exercise tracking
- (Maybe) Other activities
