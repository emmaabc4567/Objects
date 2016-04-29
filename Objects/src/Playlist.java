import java.util.ArrayList;

public class Playlist
	{
		static ArrayList<Song> playlist = new ArrayList<Song>();
		
		public static void main(String[] args)
			{
				insantiatearrayList();
				printList();
				cut10();
				printList();
				cutLongestTitle();
				printList();
				becomeaStar();
				printList();
			}
		public static void insantiatearrayList()
		{
			
			playlist.add(new Song (300, "Thrive", "Casting Crowns", "Thrive"));
			playlist.add(new Song (540, "Oceans", "Hillsong United", "Zion"));				
			playlist.add(new Song (200, "Drops in the Ocean", "Hawk Nelson", "Diamonds"));
			playlist.add(new Song (240, "Your Grace is Enough", "Chris Tomlin", "Arriving"));
			playlist.add(new Song (340, "Bless the Lord", "Matt Redman", "10,000 Reasons"));
		}
		public static void printList()
		{
			for (Song s : playlist)
				{
					System.out.println(s.getLength() + ", " + s.getName() + ", " + s.getArtist() + ", " + s.getAlbum());
					System.out.println();
				}
			System.out.println();
		}
		public static void cut10()
		{
			for (int i=0; i<playlist.size(); i++)
				{
					playlist.get(i).setLength(playlist.get(i).getLength()-10);
				}
			
		}
		public static void cutLongestTitle()
		{
			int longestNameLength = playlist.get(0).getName().length();
			for (int i=0; i<playlist.size(); i++)
				{
					if(playlist.get(i).getName().length()>longestNameLength)
						{
							longestNameLength = playlist.get(i).getName().length();
						}
				}
			for (int i=0; i<playlist.size(); i++)
				{
					if(playlist.get(i).getName().length()==longestNameLength)
						{
							playlist.remove(i);
						}
				}
		}
		public static void becomeaStar()
		{
			playlist.get(0).setArtist("Emma Miller");
		}

		
		
	}
