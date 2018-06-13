import com.serverless.ChallengeHandler;
import com.serverless.domain.Challenge;
import com.serverless.services.GenerateChallange;
import com.serverless.services.MetService;

public class test {

    public static void main(String[] args){

        GenerateChallange.genarate("{\n" +
                "    \"$id\": \"1\",\n" +
                "    \"$type\": \"Tfl.Api.Presentation.Entities.LondonAirForecast, Tfl.Api.Presentation.Entities\",\n" +
                "    \"updatePeriod\": \"hourly\",\n" +
                "    \"updateFrequency\": \"1\",\n" +
                "    \"forecastURL\": \"http://londonair.org.uk/forecast\",\n" +
                "    \"disclaimerText\": \"This forecast is intended to provide information on expected pollution levels in areas of significant public exposure. It may not apply in very specific locations close to unusually strong or short-lived local sources of pollution.\",\n" +
                "    \"currentForecast\": [\n" +
                "        {\n" +
                "            \"$id\": \"2\",\n" +
                "            \"$type\": \"Tfl.Api.Presentation.Entities.CurrentForecast, Tfl.Api.Presentation.Entities\",\n" +
                "            \"forecastType\": \"Current\",\n" +
                "            \"forecastID\": \"16717\",\n" +
                "            \"publishedDate\": \"2018-12-06T11:09:46Z\",\n" +
                "            \"forecastBand\": \"Low\",\n" +
                "            \"forecastSummary\": \"Low air pollution forecast valid from Wednesday 13 June to end of Wednesday 13 June GMT\",\n" +
                "            \"nO2Band\": \"Low\",\n" +
                "            \"o3Band\": \"Low\",\n" +
                "            \"pM10Band\": \"Low\",\n" +
                "            \"pM25Band\": \"Low\",\n" +
                "            \"sO2Band\": \"Low\",\n" +
                "            \"forecastText\": \"Slightly warmer than on Tuesday, but Wednesday is forecast to be cloudy in the afternoon. &lt;br/&gt;&lt;br/&gt;Air arriving from the North Sea, and then later from the Atlantic, is expected to carry little in the way of imported pollution with enough air movement to disperse local emissions.&lt;br/&gt;&lt;br/&gt;The relatively &#39;clean&#39; incoming air should limit ozone formation. &lt;br/&gt;&lt;br/&gt;Air pollution is expected to remain &#39;Low&#39; for the following pollutants during the forecast period:&lt;br/&gt;&lt;br/&gt;Nitrogen Dioxide&lt;br/&gt;Ozone&lt;br/&gt;PM10 Particulates&lt;br/&gt;PM25 Particulates&lt;br/&gt;Sulphur Dioxide\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"$id\": \"3\",\n" +
                "            \"$type\": \"Tfl.Api.Presentation.Entities.CurrentForecast, Tfl.Api.Presentation.Entities\",\n" +
                "            \"forecastType\": \"Future\",\n" +
                "            \"forecastID\": \"16716\",\n" +
                "            \"publishedDate\": \"2018-12-06T10:59:26Z\",\n" +
                "            \"forecastBand\": \"Low\",\n" +
                "            \"forecastSummary\": \"Low air pollution forecast valid from Thursday 14 June to end of Thursday 14 June GMT\",\n" +
                "            \"nO2Band\": \"Low\",\n" +
                "            \"o3Band\": \"Low\",\n" +
                "            \"pM10Band\": \"Low\",\n" +
                "            \"pM25Band\": \"Low\",\n" +
                "            \"sO2Band\": \"Low\",\n" +
                "            \"forecastText\": \"A continued Atlantic air flow is expected on Thursday with temperatures remaining in the low twenties.  Possible rain in the morning with sunnier spells in the afternoon.&lt;br/&gt;&lt;br/&gt;Ozone formation should be limited due to the relatively &#39;clean&#39; incoming air and adequate dispersal of local emissions.   &lt;br/&gt;&lt;br/&gt;Air pollution is expected to remain &#39;Low&#39; for the following pollutants during the forecast period:&lt;br/&gt;&lt;br/&gt;Nitrogen Dioxide&lt;br/&gt;Ozone&lt;br/&gt;PM10 Particulates&lt;br/&gt;PM25 Particulates&lt;br/&gt;Sulphur Dioxide&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;\"\n" +
                "        }\n" +
                "    ]\n" +
                "}", "{\n" +
                "    \"type\": \"FeatureCollection\",\n" +
                "    \"request_point\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "            -0.104444,\n" +
                "            51.517187\n" +
                "        ]\n" +
                "    },\n" +
                "    \"features\": [\n" +
                "        {\n" +
                "            \"type\": \"Feature\",\n" +
                "            \"geometry\": {\n" +
                "                \"type\": \"Point\",\n" +
                "                \"coordinates\": [\n" +
                "                    -0.10367,\n" +
                "                    51.51451\n" +
                "                ]\n" +
                "            },\n" +
                "            \"properties\": {\n" +
                "                \"altitude\": 27,\n" +
                "                \"request_point_distance\": 302.4486502557236,\n" +
                "                \"time_series\": [\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T09:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 6,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 5,\n" +
                "                        \"significant_weather\": 1,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 53,\n" +
                "                        \"screen_temperature\": 17\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T10:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 6,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 5,\n" +
                "                        \"significant_weather\": 1,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 51,\n" +
                "                        \"screen_temperature\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T11:00Z\",\n" +
                "                        \"10m_wind_speed\": 6,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 7,\n" +
                "                        \"feels_like_temperature\": 18,\n" +
                "                        \"uv_index\": 6,\n" +
                "                        \"significant_weather\": 1,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 47,\n" +
                "                        \"screen_temperature\": 19\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T12:00Z\",\n" +
                "                        \"10m_wind_speed\": 6,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 9,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 6,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 42,\n" +
                "                        \"screen_temperature\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T13:00Z\",\n" +
                "                        \"10m_wind_speed\": 9,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 15,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 5,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 41,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T14:00Z\",\n" +
                "                        \"10m_wind_speed\": 9,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 14,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 4,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 39,\n" +
                "                        \"screen_temperature\": 22\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T15:00Z\",\n" +
                "                        \"10m_wind_speed\": 10,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 20,\n" +
                "                        \"feels_like_temperature\": 18,\n" +
                "                        \"uv_index\": 3,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 3,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 45,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T16:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 21,\n" +
                "                        \"feels_like_temperature\": 18,\n" +
                "                        \"uv_index\": 2,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 5,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 47,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T17:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 22,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 1,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 3,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 49,\n" +
                "                        \"screen_temperature\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T18:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 23,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 49,\n" +
                "                        \"screen_temperature\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T19:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 22,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 56,\n" +
                "                        \"screen_temperature\": 19\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T20:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 21,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 62,\n" +
                "                        \"screen_temperature\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T21:00Z\",\n" +
                "                        \"10m_wind_speed\": 10,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 20,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 3,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 69,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T22:00Z\",\n" +
                "                        \"10m_wind_speed\": 10,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 20,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 2,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 75,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-13T23:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 21,\n" +
                "                        \"feels_like_temperature\": 13,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 4,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T00:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 22,\n" +
                "                        \"feels_like_temperature\": 13,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 2,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 82,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T01:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 23,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 2,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 81,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T02:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 23,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 5,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 80,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T03:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 24,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 5,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T04:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 24,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 5,\n" +
                "                        \"10m_wind_direction\": \"SSW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T05:00Z\",\n" +
                "                        \"10m_wind_speed\": 13,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 26,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 12,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T06:00Z\",\n" +
                "                        \"10m_wind_speed\": 13,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 27,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 12,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 78,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T07:00Z\",\n" +
                "                        \"10m_wind_speed\": 14,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 28,\n" +
                "                        \"feels_like_temperature\": 12,\n" +
                "                        \"uv_index\": 1,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 12,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T08:00Z\",\n" +
                "                        \"10m_wind_speed\": 14,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 29,\n" +
                "                        \"feels_like_temperature\": 13,\n" +
                "                        \"uv_index\": 1,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 21,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 79,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T09:00Z\",\n" +
                "                        \"10m_wind_speed\": 14,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 30,\n" +
                "                        \"feels_like_temperature\": 13,\n" +
                "                        \"uv_index\": 2,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 21,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 82,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T10:00Z\",\n" +
                "                        \"10m_wind_speed\": 15,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 30,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 3,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 12,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 80,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T11:00Z\",\n" +
                "                        \"10m_wind_speed\": 14,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 28,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 4,\n" +
                "                        \"significant_weather\": 8,\n" +
                "                        \"probability_of_precipitation\": 9,\n" +
                "                        \"10m_wind_direction\": \"SW\",\n" +
                "                        \"relative_humidity\": 72,\n" +
                "                        \"screen_temperature\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T12:00Z\",\n" +
                "                        \"10m_wind_speed\": 15,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 30,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 5,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"WSW\",\n" +
                "                        \"relative_humidity\": 57,\n" +
                "                        \"screen_temperature\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T13:00Z\",\n" +
                "                        \"10m_wind_speed\": 14,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 28,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 4,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 48,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T14:00Z\",\n" +
                "                        \"10m_wind_speed\": 12,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 25,\n" +
                "                        \"feels_like_temperature\": 18,\n" +
                "                        \"uv_index\": 4,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 4,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 45,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T15:00Z\",\n" +
                "                        \"10m_wind_speed\": 11,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 24,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 3,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 41,\n" +
                "                        \"screen_temperature\": 22\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T16:00Z\",\n" +
                "                        \"10m_wind_speed\": 10,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 22,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 2,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 41,\n" +
                "                        \"screen_temperature\": 22\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T17:00Z\",\n" +
                "                        \"10m_wind_speed\": 10,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 20,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 1,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 40,\n" +
                "                        \"screen_temperature\": 22\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T18:00Z\",\n" +
                "                        \"10m_wind_speed\": 9,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 18,\n" +
                "                        \"feels_like_temperature\": 19,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 40,\n" +
                "                        \"screen_temperature\": 21\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T19:00Z\",\n" +
                "                        \"10m_wind_speed\": 8,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 16,\n" +
                "                        \"feels_like_temperature\": 18,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 43,\n" +
                "                        \"screen_temperature\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T20:00Z\",\n" +
                "                        \"10m_wind_speed\": 7,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 14,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 1,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 46,\n" +
                "                        \"screen_temperature\": 19\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T21:00Z\",\n" +
                "                        \"10m_wind_speed\": 7,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 13,\n" +
                "                        \"feels_like_temperature\": 17,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 0,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 49,\n" +
                "                        \"screen_temperature\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T22:00Z\",\n" +
                "                        \"10m_wind_speed\": 6,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 12,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 0,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"NW\",\n" +
                "                        \"relative_humidity\": 51,\n" +
                "                        \"screen_temperature\": 18\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-14T23:00Z\",\n" +
                "                        \"10m_wind_speed\": 6,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 11,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 0,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 54,\n" +
                "                        \"screen_temperature\": 17\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T00:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 11,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 0,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 60,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T01:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 10,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 0,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 63,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T02:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 9,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 2,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WNW\",\n" +
                "                        \"relative_humidity\": 65,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T03:00Z\",\n" +
                "                        \"10m_wind_speed\": 4,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 7,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 2,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 67,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T04:00Z\",\n" +
                "                        \"10m_wind_speed\": 4,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 8,\n" +
                "                        \"feels_like_temperature\": 13,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 70,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T05:00Z\",\n" +
                "                        \"10m_wind_speed\": 4,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 8,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 0,\n" +
                "                        \"significant_weather\": 7,\n" +
                "                        \"probability_of_precipitation\": 3,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 69,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T06:00Z\",\n" +
                "                        \"10m_wind_speed\": 4,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 9,\n" +
                "                        \"feels_like_temperature\": 14,\n" +
                "                        \"uv_index\": 1,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 68,\n" +
                "                        \"screen_temperature\": 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T07:00Z\",\n" +
                "                        \"10m_wind_speed\": 4,\n" +
                "                        \"visibility\": \"G\",\n" +
                "                        \"10m_wind_gust\": 10,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 2,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"W\",\n" +
                "                        \"relative_humidity\": 65,\n" +
                "                        \"screen_temperature\": 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T08:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 10,\n" +
                "                        \"feels_like_temperature\": 15,\n" +
                "                        \"uv_index\": 3,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 1,\n" +
                "                        \"10m_wind_direction\": \"WSW\",\n" +
                "                        \"relative_humidity\": 60,\n" +
                "                        \"screen_temperature\": 16\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"time\": \"2018-06-15T09:00Z\",\n" +
                "                        \"10m_wind_speed\": 5,\n" +
                "                        \"visibility\": \"VG\",\n" +
                "                        \"10m_wind_gust\": 11,\n" +
                "                        \"feels_like_temperature\": 16,\n" +
                "                        \"uv_index\": 4,\n" +
                "                        \"significant_weather\": 3,\n" +
                "                        \"probability_of_precipitation\": 0,\n" +
                "                        \"10m_wind_direction\": \"WSW\",\n" +
                "                        \"relative_humidity\": 55,\n" +
                "                        \"screen_temperature\": 17\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"parameters\": {\n" +
                "        \"10m_wind_speed\": {\n" +
                "            \"uom\": \"[mi_i]/h\",\n" +
                "            \"uom_description\": \"miles per hour\"\n" +
                "        },\n" +
                "        \"screen_temperature\": {\n" +
                "            \"uom\": \"Cel\",\n" +
                "            \"uom_description\": \"degrees Celsius\"\n" +
                "        },\n" +
                "        \"uv_index\": {\n" +
                "            \"uom\": \"1\",\n" +
                "            \"uom_description\": \"dimensionless\"\n" +
                "        },\n" +
                "        \"visibility\": {\n" +
                "            \"uom\": \"1\",\n" +
                "            \"uom_description\": \"dimensionless\"\n" +
                "        },\n" +
                "        \"request_point_distance\": {\n" +
                "            \"uom\": \"m\",\n" +
                "            \"uom_description\": \"metres\"\n" +
                "        },\n" +
                "        \"10m_wind_direction\": {\n" +
                "            \"uom\": \"1\",\n" +
                "            \"uom_description\": \"dimensionless\"\n" +
                "        },\n" +
                "        \"10m_wind_gust\": {\n" +
                "            \"uom\": \"[mi_i]/h\",\n" +
                "            \"uom_description\": \"miles per hour\"\n" +
                "        },\n" +
                "        \"feels_like_temperature\": {\n" +
                "            \"uom\": \"Cel\",\n" +
                "            \"uom_description\": \"degrees Celsius\"\n" +
                "        },\n" +
                "        \"relative_humidity\": {\n" +
                "            \"uom\": \"%\",\n" +
                "            \"uom_description\": \"percentage\"\n" +
                "        },\n" +
                "        \"probability_of_precipitation\": {\n" +
                "            \"uom\": \"%\",\n" +
                "            \"uom_description\": \"percentage\"\n" +
                "        },\n" +
                "        \"significant_weather\": {\n" +
                "            \"uom\": \"1\",\n" +
                "            \"uom_description\": \"dimensionless\"\n" +
                "        }\n" +
                "    }\n" +
                "}");

    }
}
