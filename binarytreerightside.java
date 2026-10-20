class node{
    int val;
    node left;
    node right;
    node(int val)
    {
        this.val=val;
    }
}
public class binarytreerightside {
    public static int levels(node root)
    {
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left), levels(root.right));
    }
    public static void rightside(node root,int level,int levels)
    {
        if(root==null) return;
        while(level<=levels)
        {
             System.out.print(root.val+" ");
             rightside(root.right,level+1,levels);
        }
       

    }
    public static void main(String[] args) {
      node a=new node(1);
      node b=new node(2);
      node c=new node(3);
      node d=new node(4);
      node e=new node(5);
      node f=new node(6);
      node g=new node(7);
      node h=new node(8);
      node i=new node(9);
      a.left=b; a.right=c;
      b.left=d;b.right=e;
      c.right=f;
      d.left=h;h.right=i;
      e.left=g;
      int n=levels(a);
      rightside(a,0,n);
    }
    
}
