package com.mehak.sudoku.SudokuSolver.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehak.sudoku.SudokuSolver.model.SolverModel;

@Component
public class SudokuUtility {

	@Autowired
	SolverModel model;

	public void printSudoku(int[][] puzzle, int length) {

		for (int r = 0; r < length; r++) {
			for (int d = 0; d < length; d++) {
				System.out.print(model.getPuzzle()[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int) Math.sqrt(length) == 0) {
				System.out.print("");
			}
		}

	}
	public boolean isValid(int[][] puzzle,int row, int col,int number)
	{
		for (int d = 0; d < puzzle.length; d++)
		{
			
						if (puzzle[row][d] == number) {
				return false;
			}
		}
		for (int r = 0; r < puzzle.length; r++)
		{
			
			if (puzzle[r][col] == number)
			{
				return false;
			}
		}

		int sqrt = (int)Math.sqrt(puzzle.length);
		int bRow = row - row % sqrt;
		int bCol = col - col % sqrt;
		for (int r = bRow;
			r < bRow + sqrt; r++)
		{
			for (int d = bCol;
				d < bCol + sqrt; d++)
			{
				if (puzzle[r][d] == number)
				{
					return false;
				}
			}
		}
		return true;
	}
	public boolean solution(int[][] puzzle, int n)
	{
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (puzzle[i][j] == 0)
				{
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}
		if (isEmpty)
		{
			return true;
		}
		for (int number = 1; number <= n; number++)
		{
			if (isValid(puzzle, row, col, number))
			{
				puzzle[row][col] = number;
				if (solution(puzzle, n))
				{
					return true;
				}
				else
				{
					puzzle[row][col] = 0;
				}
			}
		}
		return false;
	}

}
