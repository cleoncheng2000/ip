package duke.task;

public class Deadline extends Task{
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.type = "[D]";
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return super.toString() + getType() + getStatusIcon() + getDescription() + " (by: " + getBy() + ")";
    }
}
