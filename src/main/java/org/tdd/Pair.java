package org.tdd;

public class Pair {
    private String convertFrom;
    private String convertTo;

    public Pair(String convertFrom, String convertTo) {
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (convertFrom != null ? !convertFrom.equals(pair.convertFrom) : pair.convertFrom != null) return false;
        return convertTo != null ? convertTo.equals(pair.convertTo) : pair.convertTo == null;
    }

    @Override
    public int hashCode() {
        int result = convertFrom != null ? convertFrom.hashCode() : 0;
        result = 31 * result + (convertTo != null ? convertTo.hashCode() : 0);
        return result;
    }
}
