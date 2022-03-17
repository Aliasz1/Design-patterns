package IteratorPattern;

public class Collection implements Holder{

    //create an array of items in the collection
    public String item[] = {"Pen","Case","Laptop","Phone","Notebook"};

    //method to create an iterator for the collection
    @Override
    public Iterator createIterator() {
        return new IterateCollection();
    }

    //method to iterate the collection
    private class IterateCollection implements Iterator{  
        int i;
        boolean checker;

        //checks if the collection has another item after the current
        @Override  
        public boolean hasNext(){  
            if (i<item.length){ 
                checker = true;
                return checker; 
            }  
            checker = false;
            return checker;
        }

        //used to go to the next item
        @Override  
        public Object next(){
            //if there is another item then iterate and return the item
            if(checker){  
                return item[i++];  
            }
            else{
            return null;
            }   
        }  
    }  
}
