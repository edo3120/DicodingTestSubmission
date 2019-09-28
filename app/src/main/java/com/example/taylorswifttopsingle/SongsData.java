package com.example.taylorswifttopsingle;

import java.util.ArrayList;

public class SongsData {
    private static String [] songTitles ={
            "Shake It Off",
            "I Knew You Are Trouble",
            "Blank Space",
            "Love Story",
            "I Don't Wanna Live Forever",
            "We Are Never Ever Getting Back Together",
            "Look What You Made Me Do",
            "Everything Has Changed",
            "Bad Blood",
            "Style"
    };

    private static String[] songYears ={
            "2014",
            "2012",
            "2014",
            "2009",
            "2016",
            "2012",
            "2017",
            "2012",
            "2015",
            "2015"
    };

    private static String[] detailSongs ={
            "\"Shake It Off\" is a song recorded by American singer-songwriter Taylor Swift for her fifth album, 1989 (2014). Swift co-wrote the song with its producers Max Martin and Shellback, it is an uptempo dance-pop track considered to be a departure from Swift's earlier country pop music style. \"Shake It Off\" is the sixth track on the album and serves as the lead single. The song premiered during a Yahoo! live stream session on August 18, 2014 (also streaming internationally online); its music video was also released the same day. Several hours later, the song was made available for digital download.",
            "\"I Knew You Were Trouble\" (stylized as \"I Knew You Were Trouble.\") is a song recorded by American singer-songwriter Taylor Swift for her fourth studio album, Red (2012). It was released on October 9, 2012, in the United States by Big Machine Records as the third promotional single from the album. Later, \"I Knew You Were Trouble\" was released as the third single from Red on November 27, 2012, in the United States. It was written by Swift, Max Martin and Shellback, with the production handled by the latter two.",
            "\"Blank Space\" is a song recorded by American singer-songwriter Taylor Swift for her fifth studio album 1989 (2014). It was written by Swift, Max Martin and Shellback. The song was released to the radio by Republic Records on November 10, 2014 as the album's second single, after \"Shake It Off\" and is the second track on the album. It is an electropop song with lyrics that satirize the media's perception of Swift and her relationships",
            "\"Love Story\" is a song written and recorded by American singer-songwriter Taylor Swift. She also produced the track with Nathan Chapman. It was released on September 12, 2008 by Big Machine Records, as the lead single from Swift's second studio album Fearless (2008). Considered as her signature song, it was written about a love interest of Swift's who was not popular among Swift's family and friends. Because of the scenario, Swift related to the plot of William Shakespeare's Romeo and Juliet (1597) and used it as a source of inspiration to compose the song. However, she replaced Romeo and Juliet's original tragic conclusion with a happy ending. It is a midtempo song with a dreamy soprano voice, while the melody continually builds. The lyrics are from the perspective of Juliet.",
            "\"I Don't Wanna Live Forever\", alternatively titled \"I Don't Wanna Live Forever (Fifty Shades Darker)\", is a song recorded by English singer ZAYN and American singer-songwriter Taylor Swift for the soundtrack to the 2017 film Fifty Shades Darker. It was written by Swift, Sam Dew, and its producer Jack Antonoff. The single was released on December 9, 2016, by Republic Records. The song's music video was released on January 27, 2017.",
            "\"We Are Never Ever Getting Back Together\" is a song recorded by American singer-songwriter Taylor Swift for her fourth studio album, Red (2012). Swift co-wrote the song with its producers, Max Martin and Shellback. The song was released as the lead single from Red on August 13, 2012, by Big Machine Records. Its lyrics depict Swift's frustrations at an ex-lover who wants to re-kindle their relationship. Rolling Stone magazine named the song the second best song of 2012 while it took the fourth spot in Time's end-of-year poll. The song received a Grammy Award nomination for Record of the Year. It also received a People's Choice Awards nomination for Favorite Song of the Year.",
            "\"Look What You Made Me Do\" is a song recorded by American singer-songwriter Taylor Swift, released on August 25, 2017, by Big Machine Records as the lead single from her sixth studio album Reputation (2017). Swift wrote and produced the song with her co-producer Jack Antonoff. \"Look What You Made Me Do\" is an electroclash and pop song, with lyrics about various issues that built Swift's reputation. Right Said Fred band members are also credited as songwriters, as it interpolates the melody of their song \"I'm Too Sexy\" (1991).",
            "\"Everything Has Changed\" is a song by American singer-songwriter Taylor Swift, featuring English singer-songwriter Ed Sheeran, taken from Swift's fourth studio album, Red (2012). The song was written by the artists and produced by Butch Walker, the track was released as the sixth single from the album on July 16, 2013. \"Everything Has Changed\" is a guitar ballad combining folk and pop genres about \"wanting to get to know a new lover better\".",
            "\"Bad Blood\" is a song by American singer-songwriter Taylor Swift, from her fifth studio album 1989. Swift wrote the song with its producers Max Martin and Shellback, with a remixed version featuring additional writing and guest vocals from American rapper Kendrick Lamar. The remix version was released by Republic Records on May 17, 2015 as the fourth single from 1989. The lyrics of \"Bad Blood\" describe betrayal by a close friend. The album version is the eighth track of 1989.",
            "\"Style\" is a song recorded by American singer-songwriter Taylor Swift for her fifth studio album 1989 (2014). It was written by Swift and its producers Max Martin, Shellback, and Ali Payami. Republic Records in partnership with Swift's label Big Machine released the song to US radio stations as the album's third single on February 9, 2015. Musically, \"Style\" incorporates disco, funk, and pop rock. The lyrics are ambiguous; contemporary publications interpreted the song as being about beauty standards and reflections on past romantic relationships."
    };

    private static int[] songImages={
            R.drawable.shake_it_off,
            R.drawable.i_knew_you_were_trouble,
            R.drawable.blank_space,
            R.drawable.love_story,
            R.drawable.i_dont_wanna_live_forever,
            R.drawable.we_are_never_ever_getting_back_together,
            R.drawable.look_what_you_made_me_do,
            R.drawable.everything_has_changed,
            R.drawable.bad_blood,
            R.drawable.style
    };

    static ArrayList<Song> getListData(){
        ArrayList<Song> list = new ArrayList<>();
        for (int position =0; position < songTitles.length; position++){
            Song song = new Song();
            song.setTitle(songTitles[position]);
            song.setYear(songYears[position]);
            song.setDetail(detailSongs[position]);
            song.setPhoto(songImages[position]);
            list.add(song);
        }
        return list;
    }
}
