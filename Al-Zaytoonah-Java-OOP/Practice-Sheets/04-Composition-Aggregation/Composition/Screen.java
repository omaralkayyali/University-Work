public class Screen {
    private double size; // inches
    private String resolution;

    public Screen(double size, String resolution) {
        setSize(size);
        setResolution(resolution);
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Screen size must be positive.");
        }
    }

    public void setResolution(String resolution) {
        if (resolution == null || resolution.trim().isEmpty()) {
            throw new IllegalArgumentException("Screen resolution cannot be empty.");
        }
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return String.format("Screen [%.1f\" %s]", size, resolution);
    }
}
