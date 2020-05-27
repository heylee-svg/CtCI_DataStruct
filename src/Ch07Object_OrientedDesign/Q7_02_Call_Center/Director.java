package Ch07Object_OrientedDesign.Q7_02_Call_Center;

class Director extends Employee {
    public Director(CallHandler callHandler) {
    	super(callHandler);
    	rank = Rank.Director;
    }
}
