package nz.co.ipayroll.api.sdk.base;

import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

public abstract class ResourceBase extends ResourceSupport {

    private String resourceId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ResourceBase resource = (ResourceBase) o;
        return Objects.equals(resourceId, resource.resourceId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), resourceId);
    }

    @Override
    public String toString() {
        return "ResourceBase{" +
                "resourceId='" + resourceId + '\'' +
                "} " + super.toString();
    }
}
