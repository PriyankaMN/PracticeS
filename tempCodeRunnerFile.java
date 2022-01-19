int a,T,c=0;
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        while(T>0){
        a=sc.nextInt();
        if(a>2){
//get array elements
            for(int i=0; i<a;i++){
             
                list.add(sc.nextInt());
            }

    int secondLargest = list.get(0);
    int largest = list.get(0);
    for (int i = 0; i < list.size(); i++)
    {
        if(list.get(i) > secondLargest)
        {
            if(list.get(i) > largest ) {
                secondLargest = largest;
                largest = list.get(i);
            } else {
                secondLargest = list.get(i);
            }

        }
    }
    System.out.println(secondLargest);

        }
        else{
            System.out.println(-1);
        }
        list.clear();
        T--;
}