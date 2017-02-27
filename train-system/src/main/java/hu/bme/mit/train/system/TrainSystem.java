package hu.bme.mit.train.system;

import hu.bme.mit.train.controller.Tachograph;
import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

public class TrainSystem {

	private TrainController controller = new TrainControllerImpl();
	private TrainSensor sensor = new TrainSensorImpl(controller);
	private TrainUser user = new TrainUserImpl(controller);
	public Tachograph t = new Tachograph();

	public TrainController getController() {
		return controller;
	}

	public TrainSensor getSensor() {
		return sensor;
	}

	public TrainUser getUser() {
		return user;
	}
	
	public void pushData(int A, int B){
		t.addData(A, B);
	}

}
