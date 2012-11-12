package badpie.webs.start;

import java.util.Date;

public class Category {

    private String mId;
    private String mName;
    private int mTotal;
    private Date mUpdate;

    public Date getUpdate() {
        return mUpdate;
    }

    public void setUpdate(Date update) {
        this.mUpdate = update;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getTotal() {
        return mTotal;
    }

    public void setTotal(int total) {
        this.mTotal = total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mId == null) ? 0 : mId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if (mId == null) {
            if (other.mId != null)
                return false;
        } else if (!mId.equals(other.mId))
            return false;
        return true;
    }

}
