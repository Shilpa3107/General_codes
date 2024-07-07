class Max_Bottles_Drunk {
    public static void main(String args[]){
        System.out.println(maxBottlesDrunk(13,6));
    }
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int consume = 0;
        while(numBottles >= numExchange){
            consume = consume+numExchange;
            numBottles = numBottles-numExchange;
            numBottles++;
            numExchange++;
        }
        return consume+numBottles;
    }
}