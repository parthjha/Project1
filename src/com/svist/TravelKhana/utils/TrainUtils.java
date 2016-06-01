package com.svist.TravelKhana.utils;

import java.util.List;

import com.svist.TravelKhana.beans.Train;

public interface TrainUtils {
	

	public boolean addTrain(Train t);
	public Train getTrain(int id);
	public List<Train> getAllTrain();
	

}
