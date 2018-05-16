public class LinkedListTest
{
	private Link head;
	public LinkedListTest()
	{
		head = null;
	}
	private static class Link 
	{
		double data;
		Link next;
		
		Link(double init_data, Link init_next)
		{
			data = init_data;
			next = init_next;
		}
	}
	public static Link get(Link linkName)
	{
		return linkName;
	}
	public static void insertAfter(Link linkName, Link newLink)
	{
		linkName.next = newLink;
		
	}
	public static void insertBefore(Link linkName, Link newLink)
	{
		
	}
	public static void deleteLink(Link linkName)
	{
		
	}
	public static void listLength()
	{
		
	}
	/*
	public static void printList()
	{
		Link tlink = new Link(0);
		tlink = head;
		
		while(tlink.next != null)
		{
			tlink = tlink.next;
			System.out.print("%F ", tlink.data);
		}
	}
	*/
	public static void main(String[] args)
	{
		Llist mylist = new Llist(1);
		
		myList.addLink();
		
		mylist.printList();
	}
}