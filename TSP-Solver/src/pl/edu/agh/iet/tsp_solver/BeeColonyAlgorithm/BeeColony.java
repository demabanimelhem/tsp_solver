package pl.edu.agh.iet.tsp_solver.BeeColonyAlgorithm;

import java.util.ArrayList;

public class BeeColony {
	
	private int param_num_bees;
	
	private ArrayList<Bee> Bees;
	
	private float pf;
	
	
	public BeeColony() {
		// TODO Auto-generated constructor stub
	}
	
	public BeeColony(int param_num_bees) {
		
		this.param_num_bees = param_num_bees;
		
		Bees = new ArrayList<Bee>(param_num_bees);
		
		for(int i = 0; i < param_num_bees; i++)
		{
			Bees.add(new Bee());
		}
	
	}
	
}
