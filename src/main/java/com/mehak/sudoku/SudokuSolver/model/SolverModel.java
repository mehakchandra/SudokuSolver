package com.mehak.sudoku.SudokuSolver.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class SolverModel {
 
	int[][] puzzle = new int[][] {
		{ 3, 0, 5, 4, 0, 2, 0, 6, 0 },
		{ 4, 9, 0, 7, 6, 0, 1, 0, 8 },
		{ 6, 0, 0, 1, 0, 3, 2, 4, 5 },
		{ 0, 0, 3, 9, 0, 0, 5, 8, 0 },
		{ 9, 6, 0, 0, 5, 8, 7, 0, 3 },
		{ 0, 8, 1, 3, 0, 4, 0, 9, 2 },
		{ 0, 5, 0, 6, 0, 1, 4, 0, 0 },
		{ 2, 0, 0, 5, 4, 9, 0, 7, 0 },
		{ 1, 4, 9, 0, 0, 7, 3, 0, 6 }
	};
	
	
	
	
}
