package snakeGame;

public class Main {
    public static void main(String[] args) {
        Snake snake = new Snake(6,6);
        snake.snakeMove(0,0);
    }
}

/* CODE UPDATE
New Scenario : -
---> We have added a scenario where interviewer might ask to place the food (X) in each position dynamically.
---> It means that after the Snake eats the first food, we must display the second food
---> This is similar to the actual nokia snake game where new food displays after eating the current food
---> We have used Queue data structure named 'food' to store the food positions.
---> Each time when snake eats the food (X), we are taking the next position from the queue
and displaying the new food (X) in appropriate position
---> If there is no food remaining in the queue, Game is over

Code Improvements: -
---> Added a new method 'moveForwardAndPrint' for repeatable codes

Fixed Bugs: -
Snake bites itself condition repositioned : -
---> The if condition checking 'if snake bites itself' is repositioned after the removal of tail process
---> To understand this, let us imagine the nostalgic nokia snake game
---> Imagine a scenario where snake rounds itself. It has its tail right before its head
---> If snake attempts to move forward, the tail moves first and then head moves to that position
---> Same logic applied here. Removal of tail happens first and then head is placed to that position
---> If we check 'if snake bites itself' before even removing the tail, then it will be true and Game will be over
---> This is a potential bug found after posting the video. You can reach me on LinkedIn for further clarifications
 */