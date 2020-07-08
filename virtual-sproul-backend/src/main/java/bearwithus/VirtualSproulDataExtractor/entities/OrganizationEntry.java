package bearwithus.VirtualSproulDataExtractor.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "orgData")


//Need to add new and remove some fields based off what the data contains
public class OrganizationEntry {
    @Id
    private String id;



    @Field("Name of the Organization:")
    private String name;
    //@Field("Abbreviated name of the Organization:")
    //private String abbrevName;
    @Field("Official email address of the organization:")
    private String clubEmail;
    @Field("Student organization representative name:")
    private String repreName; //student representative name
    @Field("Email of the club representative:")
    private String repreEmail; // student representative email
    @Field("What is the size of the club?")
    private String size; //eg less than 20, 20 - 50 etc.
    @Field("What is the student organization about?")
    private String intro; //What is the student organization about?
    @Field("What's it like to be a part of this student organization?")
    private String experience; //What's it like to be a part of this student organization?
    @Field("Choose top 5 tags which are the most relevant to your organization:")
    private String tags; //A big string we can parse into a String array
    @Field("Social Media")
    private String socialMedia; //eg website

    /** Constructor used by Mongo CRUD repository to match database documents to
     * new OrganizationEntry entities*/
    public OrganizationEntry() {
    }

    public OrganizationEntry(String name, String abbrevName, String clubEmail, String repreName, String repreEmail, String size, String intro, String experience, String tags, String socialMedia) {
        this.name = name;
        //this.abbrevName = abbrevName;
        this.clubEmail = clubEmail;
        this.repreName = repreName;
        this.repreEmail = repreEmail;
        this.size = size;
        this.intro = intro;
        this.experience = experience;
        this.socialMedia = socialMedia;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public String getAbbrevName() {
       // return abbrevName;
   // }

   // public void setAbbrevName(String abbrevName) {
   //     this.abbrevName = abbrevName;
   // }

    public String getClubEmail() {
        return clubEmail;
    }

    public void setClubEmail(String clubEmail) {
        this.clubEmail = clubEmail;
    }

    public String getRepreName() {
        return repreName;
    }

    public void setRepreName(String repreName) {
        this.repreName = repreName;
    }

    public String getRepreEmail() {
        return repreEmail;
    }

    public void setRepreEmail(String repreEmail) {
        this.repreEmail = repreEmail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSocialMedia() { return socialMedia; }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}

