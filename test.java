class test{
    int i ;
    int j =0;
    public test(){
        i= 10;
        j = 20;
    }
    public test (int i, int j){
        this.i = i;
        this.j = j;
    }
    public test (int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            this.i += arr[i];
        }
    }
      int add(int[] array) {
        int sum = 0;
        if(array.length> 0){
        for (int num : array) {
            sum += num;
        }
        }

        return sum;
    }
    public static void main(String[] args) {
       test test1 = new test();
       test test2 = new test(18,20);
       int [] array = {32,54,65,33};
       test test3 = new test();
       System.out.println(test1.add());
       System.out.println(test2.add());
       System.out.println(test3.add(array));
    }
    public  int add (){
        return i + j;
    }
}