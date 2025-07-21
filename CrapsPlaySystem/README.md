# Description
CrapGame is a simple Java console-based simulation of the classic casino dice game Craps. It uses SecureRandom to simulate rolling two dice and follows the official game rules to determine whether the player wins or loses.
## How the Game Works
### The player rolls two dice:
- If the sum is 7 or 11 → Player wins instantly
- If the sum is 2, 3, or 12 → Player loses instantly
- Otherwise, that sum becomes the "point"
###  The player keeps rolling:
- If the player rolls the same point again → Player wins
- If the player rolls a 7 before matching the point → Player loses
- Each roll and the final outcome are displayed in the console.
## Highlights
Uses SecureRandom for realistic dice simulation
Implements game logic using enum, loops, and conditionals
Easy to run and understand for Java beginners

