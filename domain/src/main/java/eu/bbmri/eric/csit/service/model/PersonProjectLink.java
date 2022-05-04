// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import javax.persistence.*;

@Entity
@Table(name = "person_project_link")
public class PersonProjectLink extends AuditEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    private Integer roleId;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "PersonProjectLink(roleId=" + this.getRoleId() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public PersonProjectLink() {
    }

    @java.lang.SuppressWarnings("all")
    public PersonProjectLink(final Person person, final Project project, final Integer roleId) {
        this.person = person;
        this.project = project;
        this.roleId = roleId;
    }

    @java.lang.SuppressWarnings("all")
    public Person getPerson() {
        return this.person;
    }

    @java.lang.SuppressWarnings("all")
    public Project getProject() {
        return this.project;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getRoleId() {
        return this.roleId;
    }

    @java.lang.SuppressWarnings("all")
    public void setPerson(final Person person) {
        this.person = person;
    }

    @java.lang.SuppressWarnings("all")
    public void setProject(final Project project) {
        this.project = project;
    }

    @java.lang.SuppressWarnings("all")
    public void setRoleId(final Integer roleId) {
        this.roleId = roleId;
    }
}
