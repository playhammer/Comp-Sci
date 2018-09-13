package lab3;

import plotter.SimulationPlotter;

public class RabbitSimApp {

	public static void main(String[] args) {
		SimulationPlotter p = new SimulationPlotter();
		RabbitModel model = new RabbitModel();
		
		p.simulate(model);
		
		
	}

}
