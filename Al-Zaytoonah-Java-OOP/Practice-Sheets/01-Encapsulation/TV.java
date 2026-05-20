public class TV {
    private int channel;
    private int volume;
    private boolean on;

    public TV() {
        this.channel = 1;
        this.volume = 20;
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int channel) {
        if (!on) {
            throw new IllegalStateException("TV is off. Turn it on first.");
        }
        if (channel >= 1 && channel <= 120) {
            this.channel = channel;
        } else {
            throw new IllegalArgumentException("Channel must be between 1 and 120.");
        }
    }

    public void channelUp() {
        if (!on) {
            throw new IllegalStateException("TV is off. Turn it on first.");
        }
        if (channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (!on) {
            throw new IllegalStateException("TV is off. Turn it on first.");
        }
        if (channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (!on) {
            throw new IllegalStateException("TV is off. Turn it on first.");
        }
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (!on) {
            throw new IllegalStateException("TV is off. Turn it on first.");
        }
        if (volume > 0) {
            volume--;
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return String.format("TV [on=%b, channel=%d, volume=%d]", on, channel, volume);
    }
}
