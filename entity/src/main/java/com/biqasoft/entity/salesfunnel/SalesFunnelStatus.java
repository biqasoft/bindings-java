/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.salesfunnel;

import com.biqasoft.entity.datasources.DataSource;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Value
public class SalesFunnelStatus extends AbstractSalesFunnelStatus {

    @DBRef
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SalesFunnelStatus that = (SalesFunnelStatus) o;

        return dataSource != null ? dataSource.equals(that.dataSource) : that.dataSource == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dataSource != null ? dataSource.hashCode() : 0);
        return result;
    }
}
