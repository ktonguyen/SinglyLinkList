/**
 * Created by nguyen on 7/15/17.
 */
public class Node {
        protected int data;
        protected Node link;

        public Node(int d,Node n)
        {
            data = d;
            link = n;
        }
        public void setLink(Node n)
        {
            link = n;
        }
        public Node getLink()
        {
            return link;
        }
      
}
