// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import javax.persistence.*;

@Entity
@Table(name = "form_type_option")
public class FormTypeOption extends AuditEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", insertable = false, updatable = false)
    private Person createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", insertable = false, updatable = false)
    private Person modifiedBy;

    private String option;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "FormTypeOption(option=" + this.getOption() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public FormTypeOption() {
    }

    @java.lang.SuppressWarnings("all")
    public FormTypeOption(final Person createdBy, final Person modifiedBy, final String option) {
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.option = option;
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
    public String getOption() {
        return this.option;
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
    public void setOption(final String option) {
        this.option = option;
    }
}
