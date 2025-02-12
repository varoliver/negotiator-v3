// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Class that adds fields util for Auditing purpose. It is intended to be extended by classes that
 * needs auditing information
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AuditEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private Date creationDate;

    private Date modifiedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", insertable = false, updatable = false)
    private Person createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", insertable = false, updatable = false)
    private Person modifiedBy;

    @java.lang.SuppressWarnings("all")
    public Long getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    public Date getCreationDate() {
        return this.creationDate;
    }

    @java.lang.SuppressWarnings("all")
    public Date getModifiedDate() {
        return this.modifiedDate;
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
    public void setId(final Long id) {
        this.id = id;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    @java.lang.SuppressWarnings("all")
    public void setModifiedDate(final Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @java.lang.SuppressWarnings("all")
    public void setCreatedBy(final Person createdBy) {
        this.createdBy = createdBy;
    }

    @java.lang.SuppressWarnings("all")
    public void setModifiedBy(final Person modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
