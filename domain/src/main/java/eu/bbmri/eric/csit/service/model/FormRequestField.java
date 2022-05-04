// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import javax.persistence.*;

@Entity
@Table(name = "form_request_field")
public class FormRequestField extends AuditEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", insertable = false, updatable = false)
    private Person createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", insertable = false, updatable = false)
    private Person modifiedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_request_id")
    private FormRequest formRequest;

    @Column(name = "\"order\"")
    private Integer order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_field_id")
    private FormField formField;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "FormRequestField(order=" + this.getOrder() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public FormRequestField() {
    }

    @java.lang.SuppressWarnings("all")
    public FormRequestField(final Person createdBy, final Person modifiedBy, final FormRequest formRequest, final Integer order, final FormField formField) {
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.formRequest = formRequest;
        this.order = order;
        this.formField = formField;
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
    public FormRequest getFormRequest() {
        return this.formRequest;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getOrder() {
        return this.order;
    }

    @java.lang.SuppressWarnings("all")
    public FormField getFormField() {
        return this.formField;
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
    public void setFormRequest(final FormRequest formRequest) {
        this.formRequest = formRequest;
    }

    @java.lang.SuppressWarnings("all")
    public void setOrder(final Integer order) {
        this.order = order;
    }

    @java.lang.SuppressWarnings("all")
    public void setFormField(final FormField formField) {
        this.formField = formField;
    }
}
