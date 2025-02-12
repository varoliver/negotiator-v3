// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project extends AuditEntity {

    @ManyToMany(mappedBy = "projects")
    Set<Person> persons;

    @ManyToMany(mappedBy = "projects")
    Set<Attachment> attachments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", insertable = false, updatable = false)
    private Person createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", insertable = false, updatable = false)
    private Person modifiedBy;

    private String title;

    @Lob
    private String projectDescription;

    @Lob
    private String ethicsVote;

    private Boolean testProject;

    private Date expectedEndDate;

    private Boolean expectedDataGeneration;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Project(title=" + this.getTitle() + ", projectDescription=" + this.getProjectDescription() + ", ethicsVote=" + this.getEthicsVote()
                + ", testProject=" + this.getTestProject() + ", expectedEndDate=" + this.getExpectedEndDate() + ", expectedDataGeneration="
                + this.getExpectedDataGeneration() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public Project() {
    }

    @java.lang.SuppressWarnings("all")
    public Project(final Set<Person> persons, final Set<Attachment> attachments, final Person createdBy, final Person modifiedBy, final String title,
            final String projectDescription, final String ethicsVote, final Boolean testProject, final Date expectedEndDate,
            final Boolean expectedDataGeneration) {
        if (title == null) {
            throw new java.lang.NullPointerException("title is marked non-null but is null");
        }
        this.persons = persons;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.title = title;
        this.projectDescription = projectDescription;
        this.ethicsVote = ethicsVote;
        this.testProject = testProject;
        this.expectedEndDate = expectedEndDate;
        this.expectedDataGeneration = expectedDataGeneration;
    }

    @java.lang.SuppressWarnings("all")
    public Set<Person> getPersons() {
        return this.persons;
    }

    @java.lang.SuppressWarnings("all")
    public Set<Attachment> getAttachments() {
        return this.attachments;
    }

    @java.lang.SuppressWarnings("all")
    public Person getCreatedBy() {
        return this.createdBy;
    }

    @java.lang.SuppressWarnings("all")
    public Person getModifiedBy() {
        return this.modifiedBy;
    }

    @java.lang.SuppressWarnings("all")
    public String getTitle() {
        return this.title;
    }

    @java.lang.SuppressWarnings("all")
    public String getProjectDescription() {
        return this.projectDescription;
    }

    @java.lang.SuppressWarnings("all")
    public String getEthicsVote() {
        return this.ethicsVote;
    }

    @java.lang.SuppressWarnings("all")
    public Boolean getTestProject() {
        return this.testProject;
    }

    @java.lang.SuppressWarnings("all")
    public Date getExpectedEndDate() {
        return this.expectedEndDate;
    }

    @java.lang.SuppressWarnings("all")
    public Boolean getExpectedDataGeneration() {
        return this.expectedDataGeneration;
    }

    @java.lang.SuppressWarnings("all")
    public void setPersons(final Set<Person> persons) {
        this.persons = persons;
    }

    @java.lang.SuppressWarnings("all")
    public void setAttachments(final Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreatedBy(final Person createdBy) {
        this.createdBy = createdBy;
    }

    @java.lang.SuppressWarnings("all")
    public void setModifiedBy(final Person modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @java.lang.SuppressWarnings("all")
    public void setTitle(final String title) {
        if (title == null) {
            throw new java.lang.NullPointerException("title is marked non-null but is null");
        }
        this.title = title;
    }

    @java.lang.SuppressWarnings("all")
    public void setProjectDescription(final String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @java.lang.SuppressWarnings("all")
    public void setEthicsVote(final String ethicsVote) {
        this.ethicsVote = ethicsVote;
    }

    @java.lang.SuppressWarnings("all")
    public void setTestProject(final Boolean testProject) {
        this.testProject = testProject;
    }

    @java.lang.SuppressWarnings("all")
    public void setExpectedEndDate(final Date expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    @java.lang.SuppressWarnings("all")
    public void setExpectedDataGeneration(final Boolean expectedDataGeneration) {
        this.expectedDataGeneration = expectedDataGeneration;
    }
}
