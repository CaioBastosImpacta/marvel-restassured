package br.com.fit.marvel.restassured.matchers.comics;

import io.restassured.path.json.JsonPath;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetComicsMatchers {

    public static void verifyAllComicsSuccess(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals(200, jsonPath.getInt("code")),
                () -> assertEquals("Ok", jsonPath.getString("status")),
                () -> assertEquals("© 2021 MARVEL", jsonPath.getString("copyright")),
                () -> assertEquals("Data provided by Marvel. © 2021 MARVEL", jsonPath.getString("attributionText")),
                () -> assertEquals("<a href=\"http://marvel.com\">Data provided by Marvel. © 2021 MARVEL</a>", jsonPath.getString("attributionHTML")),
                () -> assertEquals(0, jsonPath.getInt("data.offset")),
                () -> assertEquals(20, jsonPath.getInt("data.limit")),
                () -> assertEquals(48468, jsonPath.getInt("data.total")),
                () -> assertEquals(20, jsonPath.getInt("data.count")),
                () -> assertEquals(82967, jsonPath.getInt("data.results[0].id")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].digitalId")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].title")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].issueNumber")),
                () -> assertEquals("2019-11-07T08:46:15-0500", jsonPath.getString("data.results[0].modified")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82967", jsonPath.getString("data.results[0].resourceURI")),
                () -> assertEquals("detail", jsonPath.getString("data.results[0].urls[0].type")),
                () -> assertEquals("http://marvel.com/comics/issue/82967/marvel_previews_2017?utm_campaign=apiRef&utm_source=90176a73844b0060d5b7824d6959bd01", jsonPath.getString("data.results[0].urls[0].url")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/23665", jsonPath.getString("data.results[0].series.resourceURI")),
                () -> assertEquals("Marvel Previews (2017 - Present)", jsonPath.getString("data.results[0].series.name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82965", jsonPath.getString("data.results[0].variants[0].resourceURI")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].variants[0].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82970", jsonPath.getString("data.results[0].variants[1].resourceURI")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].variants[1].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82969", jsonPath.getString("data.results[0].variants[2].resourceURI")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].variants[2].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/74697", jsonPath.getString("data.results[0].variants[3].resourceURI")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].variants[3].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/72736", jsonPath.getString("data.results[0].variants[4].resourceURI")),
                () -> assertEquals("Marvel Previews (2017)", jsonPath.getString("data.results[0].variants[4].name")),
                () -> assertEquals("onsaleDate", jsonPath.getString("data.results[0].dates[0].type")),
                () -> assertEquals("2099-10-30T00:00:00-0500", jsonPath.getString("data.results[0].dates[0].date")),
                () -> assertEquals("focDate", jsonPath.getString("data.results[0].dates[1].type")),
                () -> assertEquals("2019-10-07T00:00:00-0400", jsonPath.getString("data.results[0].dates[1].date")),
                () -> assertEquals("printPrice", jsonPath.getString("data.results[0].prices[0].type")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].prices[0].price")),
                () -> assertEquals("http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available", jsonPath.getString("data.results[0].thumbnail.path")),
                () -> assertEquals("jpg", jsonPath.getString("data.results[0].thumbnail.extension")),
                () -> assertEquals(1, jsonPath.getInt("data.results[0].creators.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82967/creators", jsonPath.getString("data.results[0].creators.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/creators/10021", jsonPath.getString("data.results[0].creators.items[0].resourceURI")),
                () -> assertEquals("Jim Nausedas", jsonPath.getString("data.results[0].creators.items[0].name")),
                () -> assertEquals("editor", jsonPath.getString("data.results[0].creators.items[0].role")),
                () -> assertEquals(1, jsonPath.getInt("data.results[0].creators.returned")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].characters.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82967/characters", jsonPath.getString("data.results[0].characters.collectionURI")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].characters.returned")),
                () -> assertEquals(2, jsonPath.getInt("data.results[0].stories.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82967/stories", jsonPath.getString("data.results[0].stories.collectionURI")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/183698", jsonPath.getString("data.results[0].stories.items[0].resourceURI")),
                () -> assertEquals("cover from Marvel Previews (2017)", jsonPath.getString("data.results[0].stories.items[0].name")),
                () -> assertEquals("cover", jsonPath.getString("data.results[0].stories.items[0].type")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/stories/183699", jsonPath.getString("data.results[0].stories.items[1].resourceURI")),
                () -> assertEquals("story from Marvel Previews (2017)", jsonPath.getString("data.results[0].stories.items[1].name")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].events.available")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/82967/events", jsonPath.getString("data.results[0].events.collectionURI")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].events.returned"))
        );
    }

    public static void verifyAllComicsConflict(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals("MissingParameter", jsonPath.getString("code")),
                () -> assertEquals("You must provide a user key.", jsonPath.getString("message"))
        );
    }

    public static void verifyAllComicsIdSuccess(JsonPath jsonPath) {
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
                () -> assertEquals(1158, jsonPath.getInt("data.results[0].id")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].digitalId")),
                () -> assertEquals("ULTIMATE X-MEN VOL. 5: ULTIMATE WAR TPB (Trade Paperback)", jsonPath.getString("data.results[0].title")),
                () -> assertEquals(0, jsonPath.getInt("data.results[0].issueNumber")),
                () -> assertEquals("The Ultimates vs. the Ultimate X-Men: the battle begins. When the X-Men do the worst thing " +
                        "they could to humanity, the government orders Captain America, Iron Man, Thor and the rest of the Ultimates to " +
                        "bring them down. A small but lethal army, the Ultimates were created to face these and other newly rising threats to " +
                        "mankind. But the X-Men's founder, Professor X, hasn't been training his students for nothing -- and the youngs mutants " +
                        "just might take out the Ultimates first.", jsonPath.getString("data.results[0].description")),
                () -> assertEquals("Trade Paperback", jsonPath.getString("data.results[0].format")),
                () -> assertEquals("issue_solicit_text", jsonPath.getString("data.results[0].textObjects[0].type")),
                () -> assertEquals("en-us", jsonPath.getString("data.results[0].textObjects[0].language")),
                () -> assertEquals("The Ultimates vs. the Ultimate X-Men: the battle begins. When the X-Men do the worst thing " +
                        "they could to humanity, the government orders Captain America, Iron Man, Thor and the rest of the Ultimates to " +
                        "bring them down. A small but lethal army, the Ultimates were created to face these and other newly rising threats to " +
                        "mankind. But the X-Men's founder, Professor X, hasn't been training his students for nothing -- and the youngs mutants " +
                        "just might take out the Ultimates first.", jsonPath.getString("data.results[0].textObjects[0].text")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/1158", jsonPath.getString("data.results[0].resourceURI")),
                () -> assertEquals("detail", jsonPath.getString("data.results[0].urls[0].type")),
                () -> assertEquals("http://marvel.com/comics/collection/1158/ultimate_x-men_vol_5_ultimate_war_tpb_trade_paperback?utm_campaign=apiRef&utm_source=90176a73844b0060d5b7824d6959bd01", jsonPath.getString("data.results[0].urls[0].url")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/series/216", jsonPath.getString("data.results[0].series.resourceURI")),
                () -> assertEquals("ULTIMATE X-MEN VOL. 5: ULTIMATE WAR TPB (1999)", jsonPath.getString("data.results[0].series.name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/18477", jsonPath.getString("data.results[0].collectedIssues[0].resourceURI")),
                () -> assertEquals("Ultimate War (2003) #4", jsonPath.getString("data.results[0].collectedIssues[0].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/18476", jsonPath.getString("data.results[0].collectedIssues[1].resourceURI")),
                () -> assertEquals("Ultimate War (2003) #3", jsonPath.getString("data.results[0].collectedIssues[1].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/18475", jsonPath.getString("data.results[0].collectedIssues[2].resourceURI")),
                () -> assertEquals("Ultimate War (2003) #2", jsonPath.getString("data.results[0].collectedIssues[2].name")),
                () -> assertEquals("http://gateway.marvel.com/v1/public/comics/18474", jsonPath.getString("data.results[0].collectedIssues[3].resourceURI")),
                () -> assertEquals("Ultimate War (2003) #1", jsonPath.getString("data.results[0].collectedIssues[3].name")),
                () -> assertEquals("onsaleDate", jsonPath.getString("data.results[0].dates[0].type")),
                () -> assertEquals("2029-12-31T00:00:00-0500", jsonPath.getString("data.results[0].dates[0].date")),
                () -> assertEquals("focDate", jsonPath.getString("data.results[0].dates[1].type")),
                () -> assertEquals("1961-01-01T00:00:00-0500", jsonPath.getString("data.results[0].dates[1].date")),
                () -> assertEquals("printPrice", jsonPath.getString("data.results[0].prices[0].type")),
                () -> assertEquals(9.99, jsonPath.getDouble("data.results[0].prices[0].price"), 1)
        );
    }

    public static void verifyAllComicsIdNotFound(JsonPath jsonPath) {
        assertAll(
                () -> assertEquals("404", jsonPath.getString("code")),
                () -> assertEquals("We couldn't find that comic_issue", jsonPath.getString("status"))
        );
    }
}
