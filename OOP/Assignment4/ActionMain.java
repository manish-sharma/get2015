package com.metacube.menu;


public class ActionMain  extends Menu{
	 
		UserInterfaceMain userInterfaceMainObj=new UserInterfaceMain();

		public ActionMain() {

			addMenuItem(new ActionableMenuItem("Press 1 for Passenger", new PassengerAction()));
			addMenuItem(new ActionableMenuItem("Press 2 for Goods", new GoodsAction()));
			addMenuItem(new ActionableMenuItem("Press 3 for Exit", new  SystemExit()));
			super.display();
		}

		class PassengerAction implements Action {
			@Override
			public void perform() {
			userInterfaceMainObj.reservation(1);
			}
		}

		class GoodsAction implements Action {
			@Override
			public void perform() {
				userInterfaceMainObj.reservation(2);
			}
		}
		class SystemExit implements Action {
			@Override
			public void perform() {
				System.exit(1);
			}
		}

		

	}

