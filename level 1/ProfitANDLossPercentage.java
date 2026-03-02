//Calculating Profit and loss Percentage
class ProfitANDLossPercentage{
    public static void main(String[] args){
        //Creating a variable to get cost price
        float cost_price=129;
        //Creating a variable to get selling price
        float selling_price=191;  
            //Creating a variable to get profit 
            float profit =selling_price-cost_price;
            //Calculating Profit Percentage
            float profit_percentage=(profit/cost_price)*100.0;
            System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price);
            System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage);
        

    }
}