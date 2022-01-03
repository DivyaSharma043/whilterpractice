package com.whilterAi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "videoClip_Id", referencedColumnName = "id")
    private VideoClip videoClip;


    public void assignVideoClip(VideoClip videoClip) {
        this.videoClip= videoClip;
    }
}
