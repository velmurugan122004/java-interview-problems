class Calculator {
    private int num;
    
    public int sumOfDigits() {
        int sum = 0;
        int temp = num;
        
        while(temp>0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
            
        }
        
        return sum;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num=num;
    }
}

class sumofdigit {

	public static void main(String args[]) {

		Calculator calculator = new Calculator();
		
		int num = 6547;
		calculator.setNum(num);
		int sumOfDigits = calculator.sumOfDigits();
		System.out.println(sumOfDigits);

	}
}