package com.behavioral.template.controller;

import com.behavioral.template.model.CricketMentor;
import com.behavioral.template.model.GameType;
import com.behavioral.template.model.One_DayModel;
import com.behavioral.template.model.TestModel;
import com.behavioral.template.model._20_20Model;

/**
 * @name CricketFormateController
 * @author Sumitra
 *@description this class check type of cricket match 
 */
public class CricketFormateController {
	public CricketMentor getCricketType(GameType gameType) {
		if(gameType.equals(GameType._20__20)) {
			return _20_20Model.get_20_20Instance();
		}
		else if(gameType.equals(GameType.OneDay)) {
			return One_DayModel.getOneDayInstance();
		}
		else {
			return TestModel.getTestInstance();
		}
	}
}
