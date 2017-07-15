/**
 * Created by nguyen on 7/15/17.
 */
public class LinkedList {
        protected Node start;
        protected Node end ;
        public int size ;

        public LinkedList()
        {
            start = null;
            end = null;
            size = 0;
        }
        public boolean isEmpty()
        {
            return start == null;
        }
        public int getSize()
        {
            return size;
        }
        public void append(int val) {
            Node tmp = new Node(val, null);
            if(!isEmpty()) {
                Node current = getNode(size);
                current.setLink(tmp);
                end = tmp;
            } else {
               start = tmp;
               end = tmp;
            }
            size++ ;
        }

        private Node getNode(int index) {

            Node current = start;
            for (int i = 1; i < index; i++) {
                current = current.getLink();
            }

            return current;
        }

        public void removeEndPos() {
            if(!isEmpty()) {
                Node beforeEnd = getNode(size - 1);
                beforeEnd.setLink(null);
                size-- ;
                start = size != 0? start: null;
                end = size != 0? beforeEnd: null;

            }

        }


        public void clear() {
            if(start != null) {
                start = null;
                end = null;
                size = 0;
            }

        }

}
