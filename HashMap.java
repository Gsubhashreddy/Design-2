//Spae Complexity is : O(n*n)
//Time Complexity is : O(1)

class MyHashMap {
    private Integer [][] bucketList;
    int buckets,bucketItems;
    

    public MyHashMap() {
        buckets=1000;
        bucketItems=1000;
        bucketList=new Integer[buckets][];
    }
    
    public void put(int key, int value) {
        int index=key%buckets;
        if(bucketList[index]==null)
        {
            if(index==0)
            {
                bucketList[index]=new Integer[bucketItems+1];
            }
            else
                bucketList[index]=new Integer[bucketItems];
            
        }
        int innerIndex=key/bucketItems;
        bucketList[index][innerIndex]=value;
    }
    
    public int get(int key) {
        int index=key%buckets;
        if(bucketList[index]==null)
        {
            return -1;
        }
        else{
            int innerIndex=key/bucketItems;
            if(bucketList[index][innerIndex]==null)
            {}
            else
                return bucketList[index][innerIndex];
            return -1;
        }
        
    }
    
    public void remove(int key) {
        int index=key%buckets;
        if(bucketList[index]!=null)
        {
            int innerIndex=key/bucketItems;
            if(bucketList[index][innerIndex]!=null)
                bucketList[index][innerIndex]=null;
        }
        
        
    }
}
