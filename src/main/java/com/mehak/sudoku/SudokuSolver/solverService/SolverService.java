package com.mehak.sudoku.SudokuSolver.solverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehak.sudoku.SudokuSolver.model.SolverModel;
import com.mehak.sudoku.SudokuSolver.utilities.SudokuUtility;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SolverService {

	@Autowired
	SudokuUtility utility;

	public String solve(SolverModel model) {

		int length = model.getPuzzle().length;
		utility.printSudoku(model.getPuzzle(), length);
		System.out.println("");
		log.info("After Solving");
		if (utility.solution(model.getPuzzle(), length)) {
			utility.printSudoku(model.getPuzzle(), length);
		} else {
			System.out.println("No solution exists");
		}

		return "Succesfully Executed Code";
	}

}
