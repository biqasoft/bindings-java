/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.salesfunnel;

import com.biqasoft.entity.customer.Customer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Value
@ApiModel("Represent one sales funnel status")
public class AbstractSalesFunnelStatus implements Serializable {

    @Id
    protected String id = new ObjectId().toString();

    @ApiModelProperty("User-friendly name")
    protected String name;

    @ApiModelProperty("User-friendly description")
    protected String description;

    @ApiModelProperty("Color, background color of status. By default in hex format, but used as CSS property")
    protected String color;

    /**
     * Used to attach sales funnel to {@link Customer} salesfunnel
     * where you don't need `data source`
     *
     * @param salesFunnelStatus
     * @return
     */
    public static SalesFunnelStatusWithoutDataSource transformSalesFunnelToWithoutDataSource(SalesFunnelStatus salesFunnelStatus) {
        SalesFunnelStatusWithoutDataSource salesFunnelStatusWithoutDataSource = new SalesFunnelStatusWithoutDataSource();
        salesFunnelStatusWithoutDataSource.setId(salesFunnelStatus.getId());
        salesFunnelStatusWithoutDataSource.setName(salesFunnelStatus.getName());
        salesFunnelStatusWithoutDataSource.setColor(salesFunnelStatus.getColor());
        salesFunnelStatusWithoutDataSource.setDescription(salesFunnelStatus.getDescription());
        return salesFunnelStatusWithoutDataSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSalesFunnelStatus that = (AbstractSalesFunnelStatus) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return color != null ? color.equals(that.color) : that.color == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
