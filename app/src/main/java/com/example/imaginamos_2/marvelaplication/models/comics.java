package com.example.imaginamos_2.marvelaplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class comics {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("digitalId")
    @Expose
    private int digitalId;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("issueNumber")
    @Expose
    private double issueNumber;

    @SerializedName("variantDescription")
    @Expose
    private String variantDescription;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("modified")
    @Expose
    private Date modified;

    @SerializedName("isbn")
    @Expose
    private String isbn;

    @SerializedName("upc")
    @Expose
    private String upc;

    @SerializedName("diamondCode")
    @Expose
    private String diamondCode;

    @SerializedName("ean")
    @Expose
    private String ean;

    @SerializedName("issn")
    @Expose
    private String issn;

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("pageCount")
    @Expose
    private int pageCount;

    @SerializedName("textObjects")
    @Expose
    private List<textObject> textObjects;

    @SerializedName("resourceUri")
    @Expose
    private String resourceUri;

    @SerializedName("urls")
    @Expose
    private List<url> urls;

    @SerializedName("series")
    @Expose
    private SeriesSummary series;

    @SerializedName("variants")
    @Expose
    private List<comicSummary> variants;

    @SerializedName("collections")
    @Expose
    private List<comicSummary> collections;

    @SerializedName("collectedIssues")
    @Expose
    private List<comicSummary> collectedIssues;

    @SerializedName("dates")
    @Expose
    private List<comicDate> dates;

    @SerializedName("prices")
    @Expose
    private List<comicPrice> prices;

    @SerializedName("thumbnail")
    @Expose
    private Image thumbnail;

    @SerializedName("images")
    @Expose
    private List<Image> images;

    @SerializedName("creators")
    @Expose
    private creatorList creators;

    @SerializedName("characters")
    @Expose
    private characterList characters;

    @SerializedName("stories")
    @Expose
    private storyList stories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(int digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(double issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<textObject> getTextObjects() {
        return textObjects;
    }

    public void setTextObjects(List<textObject> textObjects) {
        this.textObjects = textObjects;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public List<url> getUrls() {
        return urls;
    }

    public void setUrls(List<url> urls) {
        this.urls = urls;
    }

    public SeriesSummary getSeries() {
        return series;
    }

    public void setSeries(SeriesSummary series) {
        this.series = series;
    }

    public List<comicSummary> getVariants() {
        return variants;
    }

    public void setVariants(List<comicSummary> variants) {
        this.variants = variants;
    }

    public List<comicSummary> getCollections() {
        return collections;
    }

    public void setCollections(List<comicSummary> collections) {
        this.collections = collections;
    }

    public List<comicSummary> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<comicSummary> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    public List<comicDate> getDates() {
        return dates;
    }

    public void setDates(List<comicDate> dates) {
        this.dates = dates;
    }

    public List<comicPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<comicPrice> prices) {
        this.prices = prices;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public creatorList getCreators() {
        return creators;
    }

    public void setCreators(creatorList creators) {
        this.creators = creators;
    }

    public characterList getCharacters() {
        return characters;
    }

    public void setCharacters(characterList characters) {
        this.characters = characters;
    }

    public storyList getStories() {
        return stories;
    }

    public void setStories(storyList stories) {
        this.stories = stories;
    }

    public eventList getEvents() {
        return events;
    }

    public void setEvents(eventList events) {
        this.events = events;
    }

    @SerializedName("events")
    @Expose
    private eventList events;



    public comics(int id, int digitalId, String title, double issueNumber, String variantDescription, String description, Date modified, String isbn, String upc, String diamondCode, String ean, String issn, String format, int pageCount, List<textObject> textObjects, String resourceUri, List<url> urls, SeriesSummary series, List<comicSummary> variants, List<comicSummary> collections, List<comicSummary> collectedIssues, List<comicDate> dates, List<comicPrice> prices, Image thumbnail, List<Image> images, creatorList creators, characterList characters, storyList stories, eventList events) {
        this.id = id;
        this.digitalId = digitalId;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.modified = modified;
        this.isbn = isbn;
        this.upc = upc;
        this.diamondCode = diamondCode;
        this.ean = ean;
        this.issn = issn;
        this.format = format;
        this.pageCount = pageCount;
        this.textObjects = textObjects;
        this.resourceUri = resourceUri;
        this.urls = urls;
        this.series = series;
        this.variants = variants;
        this.collections = collections;
        this.collectedIssues = collectedIssues;
        this.dates = dates;
        this.prices = prices;
        this.thumbnail = thumbnail;
        this.images = images;
        this.creators = creators;
        this.characters = characters;
        this.stories = stories;
        this.events = events;
    }
}
