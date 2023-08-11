package book;

public class Member {
    private String name;
    private String memberId;
    private String contactInfo;

    public Member() {
        name = "Jhon";
        memberId = "AAA-000-000-BBB";
        contactInfo = "+1-000-000-00-00";
    }

    public Member(String name, String memberId, String contactInfo) {
        this.name = name;
        this.memberId = memberId;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
