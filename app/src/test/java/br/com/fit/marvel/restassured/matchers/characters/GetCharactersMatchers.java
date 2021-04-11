package br.com.fit.marvel.restassured.matchers.characters;

import io.restassured.path.json.JsonPath;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCharactersMatchers {

    public static void verifyAllCharactersSuccess(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals(200, jsonPath.getInt("code")),
                () -> assertEquals("Ok", jsonPath.getString("status")),
                () -> assertEquals("© 2021 MARVEL", jsonPath.getString("copyright")),
                () -> assertEquals("Data provided by Marvel. © 2021 MARVEL", jsonPath.getString("attributionText")),
                () -> assertEquals("<a href=\"http://marvel.com\">Data provided by Marvel. © 2021 MARVEL</a>", jsonPath.getString("attributionHTML")),
                () -> assertEquals(0, jsonPath.getInt("data.offset")),
                () -> assertEquals(20, jsonPath.getInt("data.limit")),
                () -> assertEquals(1493, jsonPath.getInt("data.total")),
                () -> assertEquals(20, jsonPath.getInt("data.count")),
                () -> assertEquals(1011334, jsonPath.getInt("data.results[0].id")),
                () -> assertEquals("3-D Man", jsonPath.getString("data.results[0].name")),
                () -> assertEquals("", jsonPath.getString("data.results[0].description")),
                () -> assertEquals("2014-04-29T14:18:17-0400", jsonPath.getString("data.results[0].modified")),
                () -> assertEquals("http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784", jsonPath.getString("data.results[0].thumbnail.path")),
                () -> assertEquals("jpg", jsonPath.getString("data.results[0].thumbnail.extension")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1011334", jsonPath.getString("data.results[0].resourceURI")),
                () -> assertEquals(12, jsonPath.getInt("data.results[0].comics.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1011334/comics", jsonPath.getString("data.results[0].comics.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/21366", jsonPath.getString("data.results[0].comics.items[0].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #14", jsonPath.getString("data.results[0].comics.items[0].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/24571", jsonPath.getString("data.results[0].comics.items[1].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #14 (SPOTLIGHT VARIANT)", jsonPath.getString("data.results[0].comics.items[1].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/21546", jsonPath.getString("data.results[0].comics.items[2].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #15", jsonPath.getString("data.results[0].comics.items[2].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/21741", jsonPath.getString("data.results[0].comics.items[3].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #16", jsonPath.getString("data.results[0].comics.items[3].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/21975", jsonPath.getString("data.results[0].comics.items[4].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #17", jsonPath.getString("data.results[0].comics.items[4].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/22299", jsonPath.getString("data.results[0].comics.items[5].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #18", jsonPath.getString("data.results[0].comics.items[5].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/22300", jsonPath.getString("data.results[0].comics.items[6].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #18 (ZOMBIE VARIANT)", jsonPath.getString("data.results[0].comics.items[6].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/22506", jsonPath.getString("data.results[0].comics.items[7].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #19", jsonPath.getString("data.results[0].comics.items[7].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/8500", jsonPath.getString("data.results[0].comics.items[8].resourceURI")),
                () -> assertEquals("Deadpool (1997) #44", jsonPath.getString("data.results[0].comics.items[8].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/10223", jsonPath.getString("data.results[0].comics.items[9].resourceURI")),
                () -> assertEquals("Marvel Premiere (1972) #35", jsonPath.getString("data.results[0].comics.items[9].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/10224", jsonPath.getString("data.results[0].comics.items[10].resourceURI")),
                () -> assertEquals("Marvel Premiere (1972) #36", jsonPath.getString("data.results[0].comics.items[10].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/10225", jsonPath.getString("data.results[0].comics.items[11].resourceURI")),
                () -> assertEquals("Marvel Premiere (1972) #37", jsonPath.getString("data.results[0].comics.items[11].name")),
                () -> assertEquals(12, jsonPath.getInt("data.results[0].comics.returned")),
                () -> assertEquals(3, jsonPath.getInt("data.results[0].series.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1011334/series", jsonPath.getString("data.results[0].series.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/1945", jsonPath.getString("data.results[0].series.items[0].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007 - 2010)", jsonPath.getString("data.results[0].series.items[0].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/2005", jsonPath.getString("data.results[0].series.items[1].resourceURI")),
                () -> assertEquals("Deadpool (1997 - 2002)", jsonPath.getString("data.results[0].series.items[1].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/2045", jsonPath.getString("data.results[0].series.items[2].resourceURI")),
                () -> assertEquals("Marvel Premiere (1972 - 1981)", jsonPath.getString("data.results[0].series.items[2].name")),
                () -> assertEquals(3, jsonPath.getInt("data.results[0].series.returned")),
                () -> assertEquals(21, jsonPath.getInt("data.results[0].stories.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1011334/stories", jsonPath.getString("data.results[0].stories.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19947", jsonPath.getString("data.results[0].stories.items[0].resourceURI")),
                () -> assertEquals("Cover #19947", jsonPath.getString("data.results[0].stories.items[0].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[0].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19948", jsonPath.getString("data.results[0].stories.items[1].resourceURI")),
                () -> assertEquals("The 3-D Man!", jsonPath.getString("data.results[0].stories.items[1].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[1].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19949", jsonPath.getString("data.results[0].stories.items[2].resourceURI")),
                () -> assertEquals("Cover #19949", jsonPath.getString("data.results[0].stories.items[2].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[2].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19950", jsonPath.getString("data.results[0].stories.items[3].resourceURI")),
                () -> assertEquals("The Devil's Music!", jsonPath.getString("data.results[0].stories.items[3].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[3].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19951", jsonPath.getString("data.results[0].stories.items[4].resourceURI")),
                () -> assertEquals("Cover #19951", jsonPath.getString("data.results[0].stories.items[4].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[4].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/19952", jsonPath.getString("data.results[0].stories.items[5].resourceURI")),
                () -> assertEquals("Code-Name:  The Cold Warrior!", jsonPath.getString("data.results[0].stories.items[5].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[5].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47184", jsonPath.getString("data.results[0].stories.items[6].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #14", jsonPath.getString("data.results[0].stories.items[6].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[6].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47185", jsonPath.getString("data.results[0].stories.items[7].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #14 - Int", jsonPath.getString("data.results[0].stories.items[7].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[7].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47498", jsonPath.getString("data.results[0].stories.items[8].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #15", jsonPath.getString("data.results[0].stories.items[8].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[8].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47499", jsonPath.getString("data.results[0].stories.items[9].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #15 - Int", jsonPath.getString("data.results[0].stories.items[9].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[9].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47792", jsonPath.getString("data.results[0].stories.items[10].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #16", jsonPath.getString("data.results[0].stories.items[10].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[10].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/47793", jsonPath.getString("data.results[0].stories.items[11].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #16 - Int", jsonPath.getString("data.results[0].stories.items[11].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[11].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/48361", jsonPath.getString("data.results[0].stories.items[12].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #17", jsonPath.getString("data.results[0].stories.items[12].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[12].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/48362", jsonPath.getString("data.results[0].stories.items[13].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #17 - Int", jsonPath.getString("data.results[0].stories.items[13].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[13].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/49103", jsonPath.getString("data.results[0].stories.items[14].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #18", jsonPath.getString("data.results[0].stories.items[14].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[14].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/49104", jsonPath.getString("data.results[0].stories.items[15].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #18 - Int", jsonPath.getString("data.results[0].stories.items[15].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[15].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/49106", jsonPath.getString("data.results[0].stories.items[16].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #18, Zombie Variant - Int", jsonPath.getString("data.results[0].stories.items[16].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[16].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/49888", jsonPath.getString("data.results[0].stories.items[17].resourceURI")),
                () -> assertEquals("AVENGERS: THE INITIATIVE (2007) #19", jsonPath.getString("data.results[0].stories.items[17].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[17].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/49889", jsonPath.getString("data.results[0].stories.items[18].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #19 - Int", jsonPath.getString("data.results[0].stories.items[18].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[18].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/54371", jsonPath.getString("data.results[0].stories.items[19].resourceURI")),
                () -> assertEquals("Avengers: The Initiative (2007) #14, Spotlight Variant - Int", jsonPath.getString("data.results[0].stories.items[19].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[19].type")),
                () -> assertEquals(20, jsonPath.getInt("data.results[0].stories.returned"))
        );
    }

    public static void verifyIdCharacterSuccess(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals(200, jsonPath.getInt("code")),
                () -> assertEquals("Ok", jsonPath.getString("status")),
                () -> assertEquals("© 2021 MARVEL", jsonPath.getString("copyright")),
                () -> assertEquals("Data provided by Marvel. © 2021 MARVEL", jsonPath.getString("attributionText")),
                () -> assertEquals("<a href=\"http://marvel.com\">Data provided by Marvel. © 2021 MARVEL</a>", jsonPath.getString("attributionHTML")),
                () -> assertEquals(0, jsonPath.getInt("data.offset")),
                () -> assertEquals(20, jsonPath.getInt("data.limit")),
                () -> assertEquals(1, jsonPath.getInt("data.total")),
                () -> assertEquals(1, jsonPath.getInt("data.count")),
                () -> assertEquals(1016823, jsonPath.getInt("data.results[0].id")),
                () -> assertEquals("Abomination (Ultimate)", jsonPath.getString("data.results[0].name")),
                () -> assertEquals("", jsonPath.getString("data.results[0].description")),
                () -> assertEquals("2012-07-10T19:11:52-0400", jsonPath.getString("data.results[0].modified")),
                () -> assertEquals("http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available", jsonPath.getString("data.results[0].thumbnail.path")),
                () -> assertEquals("jpg", jsonPath.getString("data.results[0].thumbnail.extension")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1016823", jsonPath.getString("data.results[0].resourceURI")),
                () -> assertEquals(2, jsonPath.getInt("data.results[0].comics.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1016823/comics", jsonPath.getString("data.results[0].comics.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/40638", jsonPath.getString("data.results[0].comics.items[0].resourceURI")),
                () -> assertEquals("Hulk (2008) #50", jsonPath.getString("data.results[0].comics.items[0].name")),
                () -> assertEquals(2, jsonPath.getInt("data.results[0].series.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1016823/series", jsonPath.getString("data.results[0].series.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/3374", jsonPath.getString("data.results[0].series.items[0].resourceURI")),
                () -> assertEquals("Hulk (2008 - 2012)", jsonPath.getString("data.results[0].series.items[0].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/474", jsonPath.getString("data.results[0].series.items[1].resourceURI")),
                () -> assertEquals("Ultimate X-Men (2001 - 2009)", jsonPath.getString("data.results[0].series.items[1].name")),
                () -> assertEquals(2, jsonPath.getInt("data.results[0].series.returned")),
                () -> assertEquals(3, jsonPath.getInt("data.results[0].stories.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1016823/stories", jsonPath.getString("data.results[0].stories.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/31883", jsonPath.getString("data.results[0].stories.items[0].resourceURI")),
                () -> assertEquals("Free Preview of THE INCREDIBLE HULK #50", jsonPath.getString("data.results[0].stories.items[0].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[0].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/92098", jsonPath.getString("data.results[0].stories.items[1].resourceURI")),
                () -> assertEquals("Hulk (2008) #50", jsonPath.getString("data.results[0].stories.items[1].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[1].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/92099", jsonPath.getString("data.results[0].stories.items[2].resourceURI")),
                () -> assertEquals("Interior #92099", jsonPath.getString("data.results[0].stories.items[2].name")),
                () -> assertEquals("interiorStory", jsonPath.getString("data.results[0].stories.items[2].type")),
                () -> assertEquals(3, jsonPath.getInt("data.results[0].stories.returned")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].events.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/characters/1016823/events", jsonPath.getString("data.results[0].events.collectionURI")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].events.returned")),
                () -> assertEquals("detail", jsonPath.getString("data.results[0].urls[0].type")),
                () -> assertEquals("http://marvel.com/characters/81/abomination?utm_campaign=apiRef&utm_source=90176a73844b0060d5b7824d6959bd01", jsonPath.getString("data.results[0].urls[0].url")),
                () -> assertEquals("comiclink", jsonPath.getString("data.results[0].urls[1].type")),
                () -> assertEquals("http://marvel.com/comics/characters/1016823/abomination_ultimate?utm_campaign=apiRef&utm_source=90176a73844b0060d5b7824d6959bd01", jsonPath.getString("data.results[0].urls[1].url"))
        );
    }

    public static void verifyIdCharacterNotFound(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals("404", jsonPath.getString("code")),
                () -> assertEquals("We couldn't find that character", jsonPath.getString("status"))
        );
    }

    public static void verifyIdCharacterConflict(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals("MissingParameter", jsonPath.getString("code")),
                () -> assertEquals("You must provide a user key.", jsonPath.getString("message"))
        );
    }
}
