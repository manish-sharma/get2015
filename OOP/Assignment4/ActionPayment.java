package com.metacube.menu;


public class ActionPayment extends Menu {

		Payment paymentObject = new Payment();
	public ActionPayment() {

				addMenuItem(new ActionableMenuItem("Press 1 for Pay by credit card", new CreditCard()));
				addMenuItem(new ActionableMenuItem("Press 2 for pay by wallet", new Wallet()));
				addMenuItem(new ActionableMenuItem("Press 3 for pay by net banking", new  NetBanking()));
				super.display();
		
			}

			class CreditCard implements Action {
				@Override
				public void perform() {
					 paymentObject.payByCreditCard();
			
				}
			}

			class Wallet implements Action {
				@Override
				public void perform() {
					paymentObject.payByWallet();
				}
			}
			class NetBanking implements Action {
				@Override
				public void perform() {
					 paymentObject.payByNetBanking();
				}
			}

			

		}



