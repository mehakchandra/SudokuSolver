package com.mehak.sudoku.SudokuSolver.solverController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehak.sudoku.SudokuSolver.model.SolverModel;
import com.mehak.sudoku.SudokuSolver.solverService.SolverService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class SolverController {
	
	@Autowired
	SolverService solverService;
	
	@GetMapping
	private String getNothing() {
		return " Welcome To Mehak Chandra's Git-Workspace";
	}
	
	@GetMapping("/solver")
	private String createEmployee(SolverModel model) {
		
		log.info("Before Solving Showing Sudoku");
		return solverService.solve(model);
		
	}

}
