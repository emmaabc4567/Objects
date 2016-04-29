import java.util.Scanner;
import java.util.ArrayList;

public class Song
	{
		private String name, artist, album;
		private int length;

		public Song(int l, String n, String a, String ab)
		{
			length = l;
			name = n;
			artist = a;
			album = ab;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getArtist()
			{
				return artist;
			}

		public void setArtist(String artist)
			{
				this.artist = artist;
			}

		public String getAlbum()
			{
				return album;
			}

		public void setAlbum(String album)
			{
				this.album = album;
			}
		public int getLength()
			{
				return length;
			}

		public void setLength(int length)
			{
				this.length = length;
			}
	}
